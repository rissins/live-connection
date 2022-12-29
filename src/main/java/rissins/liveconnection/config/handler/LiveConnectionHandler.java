//package rissins.liveconnection.config.handler;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.CloseStatus;
//import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//@Component
//@Slf4j
//public class LiveConnectionHandler extends TextWebSocketHandler {
//
//    private static final List<WebSocketSession> list = new ArrayList<>();
//
//    private static final Map<String, WebSocketSession> sessionMap = new ConcurrentHashMap<>();
//
//    public static int count = 0;
//
//    public static Map<Integer, WebSocketSession> countMap = new ConcurrentHashMap<>();
//
//    @Override
//    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
//        String payload = message.getPayload();
//        count++;
//        System.out.println("count = " + count);
//        log.info("payload : " + payload);
//        for(WebSocketSession sess: list) {
//            sess.sendMessage(message);
//        }
//    }
//
//    /* Client가 접속 시 호출되는 메서드 */
//    @Override
//    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//
//        var sessionId = session.getId();
//        sessionMap.put(sessionId, session);
//
////        Message message = Message.builder()
////                .userSession(sessionId)
////                .build();
////        message.newConnect();
//
////        sessionMap.values().forEach(s -> {
////            try {
////                if(!s.getId().equals(sessionId)) {
////                    log.info("{} connect", message);
////                }
////            } catch (Exception e) {
////            }
////        });
//
//        log.info("현재 연결된 세션 수 {}", sessionMap.size());
//
//        list.add(session);
//
//        log.info(session + " 클라이언트 접속");
//    }
//
//    /* Client가 접속 해제 시 호출되는 메서드드 */
//
//    @Override
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
//        var sessionId = session.getId();
//        sessionMap.remove(sessionId);
//
////        final Message message = new Message();
////        message.closeConnect();
////        message.setUserSession(sessionId);
//
////        Message message = Message.builder()
////                .sender(sessionId)
////                .receiver("all")
////                .build();
////        message.closeConnect();
//
//        log.info(session + " 클라이언트 접속 해제");
//        list.remove(session);
//    }
//}
