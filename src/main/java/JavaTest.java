import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
public class JavaTest {

    private static ZooKeeper zooKeeper;

    public static void main(String[] args) {
        String connectString = "localhost:2181"; // ZooKeeper 서버 주소
        int sessionTimeout = 2000;

        try {
            zooKeeper = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    // Watcher 이벤트 처리
                }
            });

            String rootNode = "/"; // 시작 노드
            JSONObject tree = buildTreeView(rootNode);

            // JSON 형식으로 출력
            System.out.println(tree.toString(2));

        } catch (IOException | KeeperException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject buildTreeView(String node) throws KeeperException, InterruptedException {
        JSONObject jsonObject = new JSONObject();

        // 현재 노드의 값을 가져옴
        byte[] data = zooKeeper.getData(node, false, null);
        String value = data != null ? new String(data) : "null";

        jsonObject.put(node, value);

        // 자식 노드를 가져옴
        List<String> children = zooKeeper.getChildren(node, false);
        for (String child : children) {
            String childPath = node.equals("/") ? node + child : node + "/" + child;
            JSONObject childJson = buildTreeView(childPath);
            for (String key : childJson.keySet()) {
                jsonObject.put(key, childJson.get(key));
            }
        }

        return jsonObject;
    }
}
