extends CanvasLayer

@onready var label: Label = $Panel/Label


func _on_button_pressed() -> void:
	if Engine.has_singleton("MyPlugin"):
		var singleton = Engine.get_singleton("MyPlugin")
		label.text = singleton.getHello()
	else:
		label.text = "error"
