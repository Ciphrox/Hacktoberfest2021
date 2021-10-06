import 'package:flutter/material.dart';

class RoundIcon extends StatelessWidget {
  final IconData iconData;
  final Function onPress;
  final String tag;
  RoundIcon(
      {@required this.iconData, @required this.onPress, @required this.tag});

  @override
  Widget build(BuildContext context) {
    return FloatingActionButton(
      heroTag: tag,
      onPressed: onPress,
      backgroundColor: Color(0xFF4C4F5E),
      child: Icon(iconData, size: 30, color: Colors.white),
    );
  }
}
