package org.diabblog.web;
import org.diabblog.domain.Entry;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/entrys")
@Controller
@RooWebScaffold(path = "entrys", formBackingObject = Entry.class)
public class EntryController {
}
