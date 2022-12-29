package rissins.liveconnection.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static rissins.liveconnection.config.WebSocketConfig.count;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {

    @GetMapping("main")
    public String index(Model model) {
        model.addAttribute("count", count);
        return "main";
    }

    @PostMapping("room")
    @ResponseBody
    public int createRoom() {
        return count;
    }
}
