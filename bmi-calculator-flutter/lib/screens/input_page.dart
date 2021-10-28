import 'package:bmi_calculator/providers/bmi_provider.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import '../widgets/Icon_Content.dart';
import '../widgets/Reusable_Container.dart';
import '../utils/colors.dart';
import '../utils/text_styles.dart';
import '../widgets/RoundButtonIcon.dart';
import 'results_page.dart';
import '../widgets/BottomButton.dart';
import 'package:provider/provider.dart';
import 'package:bmi_calculator/services/CalculateBMI.dart';

enum Gender { Male, Female }

class InputPage extends StatefulWidget {
  @override
  _InputPageState createState() => _InputPageState();
}

class _InputPageState extends State<InputPage> {
  BMIProvider bmiProvider;

  Gender selectedGender;
  int height = 180;
  int weight = 50;
  int age = 10;

  @override
  Widget build(BuildContext context) {
    bmiProvider = context.watch<BMIProvider>();
    return Scaffold(
      appBar: AppBar(
        title: Center(
          child: Text(
            'BMI Calculator',
            style: TextStyle(
              fontSize: 25,
            ),
          ),
        ),
      ),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: [
          Expanded(
            child: Row(
              children: [
                Expanded(
                  child: ReusableContainer(
                    onPress: () {
                      bmiProvider.updateGender(Gender.Male);
                    },
                    colr: (bmiProvider.gender == Gender.Male)
                        ? kActiveColor
                        : kInactiveColor,
                    cardChild: IconContent(
                      icon: FontAwesomeIcons.mars,
                      text: 'MALE',
                    ),
                  ),
                ),
                Expanded(
                  child: ReusableContainer(
                    onPress: () {
                      bmiProvider.updateGender(Gender.Female);
                    },
                    colr: (bmiProvider.gender == Gender.Female)
                        ? kActiveColor
                        : kInactiveColor,
                    cardChild: IconContent(
                      icon: FontAwesomeIcons.venus,
                      text: 'FEMALE',
                    ),
                  ),
                )
              ],
            ),
          ),
          Expanded(
            child: Padding(
              padding: const EdgeInsets.all(2.0),
              child: ReusableContainer(
                colr: kActiveColor,
                cardChild: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text(
                      'HEIGHT',
                      style: kLabelTextStyle,
                    ),
                    SizedBox(
                      height: 5,
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      crossAxisAlignment: CrossAxisAlignment.baseline,
                      textBaseline: TextBaseline.alphabetic,
                      children: [
                        Text(
                          bmiProvider.height.toString(),
                          style: kNumberLabel,
                        ),
                        SizedBox(
                          width: 5,
                        ),
                        Text(
                          'cm',
                          style: kLabelTextStyle,
                        ),
                      ],
                    ),
                    SliderTheme(
                      data: SliderTheme.of(context).copyWith(
                        inactiveTrackColor: Colors.blueGrey,
                        thumbColor: kBottomContainerColor,
                        overlayColor: Color(0x29EB1555),
                        thumbShape:
                            RoundSliderThumbShape(enabledThumbRadius: 12.0),
                        overlayShape:
                            RoundSliderOverlayShape(overlayRadius: 20),
                      ),
                      child: Slider(
                        value: bmiProvider.height.toDouble(),
                        min: 120,
                        max: 240,
                        activeColor: kBottomContainerColor,
                        onChanged: (double newValue) {
                          bmiProvider.updateHeight(newValue.toInt());
                        },
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ),
          Expanded(
            child: Row(
              children: [
                Expanded(
                  child: ReusableContainer(
                    colr: kActiveColor,
                    cardChild: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Text(
                          'WEIGHT',
                          style: kLabelTextStyle,
                        ),
                        SizedBox(
                          height: 5,
                        ),
                        Text(
                          bmiProvider.weight.toString(),
                          style: kNumberLabel,
                        ),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            RoundIcon(
                              iconData: Icons.remove,
                              onPress: () {
                                bmiProvider
                                    .updateWeight(bmiProvider.weight -= 1);
                              },
                              tag: "button1",
                            ),
                            SizedBox(
                              width: 10,
                            ),
                            RoundIcon(
                              iconData: Icons.add,
                              onPress: () {
                                bmiProvider
                                    .updateWeight(bmiProvider.weight += 1);
                              },
                              tag: "button2",
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                ),
                Expanded(
                  child: ReusableContainer(
                    colr: kActiveColor,
                    cardChild: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Text(
                          'AGE',
                          style: kLabelTextStyle,
                        ),
                        SizedBox(
                          height: 5,
                        ),
                        Text(
                          bmiProvider.age.toString(),
                          style: kNumberLabel,
                        ),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            RoundIcon(
                              iconData: Icons.remove,
                              onPress: () {
                                bmiProvider.updateAge(bmiProvider.age -= 1);
                              },
                              tag: "button3",
                            ),
                            SizedBox(
                              width: 10,
                            ),
                            RoundIcon(
                              iconData: Icons.add,
                              onPress: () {
                                bmiProvider.updateAge(bmiProvider.age += 1);
                              },
                              tag: "button4",
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                ),
              ],
            ),
          ),
          BottomButton(
            text: 'CALCULATE',
            onTap: () {
              bmiProvider.calculateBMI();
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => ResultsPage(),
                ),
              );
            },
          ),
        ],
      ),
    );
  }
}
