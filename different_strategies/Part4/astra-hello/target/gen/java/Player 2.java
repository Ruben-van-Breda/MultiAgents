/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Player extends ASTRAClass {
	public Player() {
		setParents(new Class[] {TicTacToe.class});
		addRule(new Rule(
			"Player", new int[] {43,9,43,64},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "token",false),
							new Variable(Type.BOOLEAN, "turn",false),
							new Variable(Type.STRING, "opponent",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {43,63,55,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {45,8,55,5},
						new Predicate("opponent", new Term[] {
							new Variable(Type.STRING, "opponent")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {46,8,55,5},
						new Predicate("token", new Term[] {
							new Variable(Type.STRING, "token")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {47,8,55,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "token"),
							new Variable(Type.BOOLEAN, "turn")
						})
					),
					new If(
						"Player", new int[] {48,8,55,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "turn"),
							Primitive.newPrimitive(true)
						),
						new Block(
							"Player", new int[] {48,24,51,9},
							new Statement[] {
								new BeliefUpdate('+',
									"Player", new int[] {49,12,51,9},
									new Predicate("player", new Term[] {
										new Variable(Type.STRING, "token")
									})
								),
								new BeliefUpdate('+',
									"Player", new int[] {50,12,51,9},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "token")
									})
								)
							}
						)
					),
					new ModuleCall("C",
						"Player", new int[] {53,8,53,24},
						new Predicate("println", new Term[] {
							new Variable(Type.STRING, "token")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {57,9,58,5},
			new GoalEvent('+',
				new Goal(
					new Predicate("turn", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {58,4,63,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {59,8,63,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					),
					new ModuleCall("C",
						"Player", new int[] {60,8,60,48},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("It is "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "Player"),
									Primitive.newPrimitive("'s turn")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Player", new int[] {61,8,63,5},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "Player")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {64,9,65,5},
			new BeliefEvent('+',
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "Player",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {65,4,69,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {66,8,69,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "Player")
						})
					),
					new Subgoal(
						"Player", new int[] {68,8,69,5},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "Player")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {79,9,79,67},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "T",false),
					new Variable(Type.INTEGER, "L",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {79,66,85,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {80,8,85,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('-',
						"Player", new int[] {81,8,85,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('-',
						"Player", new int[] {82,8,85,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {86,9,86,61},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("EndGame", new Term[] {
					new Variable(Type.STRING, "T",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {86,60,93,5},
				new Statement[] {
					new ModuleCall("C",
						"Player", new int[] {87,8,87,57},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Recieved message inform to END GAME ")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("S",
						"Player", new int[] {88,8,88,16},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Player","S")).exit(
								);
							}
						}
					),
					new ModuleCall("S",
						"Player", new int[] {89,8,89,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Player","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {98,9,98,64},
			new MessageEvent(
				new Performative("request"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("startTurn", new Term[] {
					new Variable(Type.STRING, "X",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {98,63,107,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {100,8,107,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "X")
						})
					),
					new ModuleCall("S",
						"Player", new int[] {103,8,103,19},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(100)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Player","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {120,9,120,113},
			new GoalEvent('+',
				new Goal(
					new Predicate("CheckDraw", new Term[] {})
				)
			),
			new AND(
				new NOT(
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(1)
					})
				),
				new AND(
					new NOT(
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(2)
						})
					),
					new AND(
						new NOT(
							new Predicate("free", new Term[] {
								Primitive.newPrimitive(3)
							})
						),
						new AND(
							new NOT(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(4)
								})
							),
							new AND(
								new NOT(
									new Predicate("free", new Term[] {
										Primitive.newPrimitive(5)
									})
								),
								new AND(
									new NOT(
										new Predicate("free", new Term[] {
											Primitive.newPrimitive(6)
										})
									),
									new AND(
										new NOT(
											new Predicate("free", new Term[] {
												Primitive.newPrimitive(7)
											})
										),
										new AND(
											new NOT(
												new Predicate("free", new Term[] {
													Primitive.newPrimitive(8)
												})
											),
											new NOT(
												new Predicate("free", new Term[] {
													Primitive.newPrimitive(9)
												})
											)
										)
									)
								)
							)
						)
					)
				)
			),
			new Block(
				"Player", new int[] {120,112,124,5},
				new Statement[] {
					new ModuleCall("C",
						"Player", new int[] {121,8,121,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Game is drawn")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {125,9,125,24},
			new GoalEvent('+',
				new Goal(
					new Predicate("CheckDraw", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {125,23,127,5},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {132,9,132,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "Player"),
					Primitive.newPrimitive(1)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(2)
					}),
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(3)
					})
				)
			),
			new Block(
				"Player", new int[] {132,89,143,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {133,8,143,5},
						new Predicate("line", new Term[] {
							Primitive.newPrimitive(1),
							Primitive.newPrimitive(2),
							Primitive.newPrimitive(3)
						})
					),
					new ModuleCall("C",
						"Player", new int[] {134,8,134,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {135,8,143,5},
						new Comparison("==",
							new Variable(Type.STRING, "Player"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player", new int[] {135,25,139,9},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {136,12,136,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("X")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {137,12,137,46},
									new Performative("inform"),
									Primitive.newPrimitive("X"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {139,13,143,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {140,12,140,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("O")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {144,9,144,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "Player"),
					Primitive.newPrimitive(1)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(5)
					}),
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(9)
					})
				)
			),
			new Block(
				"Player", new int[] {144,89,155,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {145,8,155,5},
						new Predicate("line", new Term[] {
							Primitive.newPrimitive(1),
							Primitive.newPrimitive(5),
							Primitive.newPrimitive(9)
						})
					),
					new ModuleCall("C",
						"Player", new int[] {146,8,146,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {147,8,155,5},
						new Comparison("==",
							new Variable(Type.STRING, "Player"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player", new int[] {147,25,150,9},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {148,12,148,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("X")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {149,12,149,46},
									new Performative("inform"),
									Primitive.newPrimitive("X"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {150,13,155,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {151,12,151,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("O")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {152,12,152,46},
									new Performative("inform"),
									Primitive.newPrimitive("O"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {156,9,156,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "Player"),
					Primitive.newPrimitive(1)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(4)
					}),
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(7)
					})
				)
			),
			new Block(
				"Player", new int[] {156,89,166,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {157,8,166,5},
						new Predicate("line", new Term[] {
							Primitive.newPrimitive(1),
							Primitive.newPrimitive(4),
							Primitive.newPrimitive(7)
						})
					),
					new ModuleCall("C",
						"Player", new int[] {158,8,158,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {159,8,166,5},
						new Comparison("==",
							new Variable(Type.STRING, "Player"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player", new int[] {159,25,162,9},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {160,12,160,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("X")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {161,12,161,46},
									new Performative("inform"),
									Primitive.newPrimitive("X"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {162,13,166,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {163,12,163,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("O")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {164,12,164,46},
									new Performative("inform"),
									Primitive.newPrimitive("O"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {167,9,167,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "Player"),
					Primitive.newPrimitive(2)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(5)
					}),
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(8)
					})
				)
			),
			new Block(
				"Player", new int[] {167,89,177,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {168,8,177,5},
						new Predicate("line", new Term[] {
							Primitive.newPrimitive(2),
							Primitive.newPrimitive(5),
							Primitive.newPrimitive(8)
						})
					),
					new ModuleCall("C",
						"Player", new int[] {169,8,169,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {170,8,177,5},
						new Comparison("==",
							new Variable(Type.STRING, "Player"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player", new int[] {170,25,173,9},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {171,12,171,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("X")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {172,4,172,38},
									new Performative("inform"),
									Primitive.newPrimitive("X"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {173,13,177,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {174,12,174,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("O")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {175,12,175,46},
									new Performative("inform"),
									Primitive.newPrimitive("O"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {178,9,178,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "Player"),
					Primitive.newPrimitive(3)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(5)
					}),
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(7)
					})
				)
			),
			new Block(
				"Player", new int[] {178,89,188,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {179,8,188,5},
						new Predicate("line", new Term[] {
							Primitive.newPrimitive(3),
							Primitive.newPrimitive(5),
							Primitive.newPrimitive(7)
						})
					),
					new ModuleCall("C",
						"Player", new int[] {180,8,180,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {181,8,188,5},
						new Comparison("==",
							new Variable(Type.STRING, "Player"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player", new int[] {181,25,184,9},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {182,12,182,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("X")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {183,12,183,46},
									new Performative("inform"),
									Primitive.newPrimitive("X"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {184,13,188,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {185,12,185,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("O")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {186,12,186,46},
									new Performative("inform"),
									Primitive.newPrimitive("O"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {189,9,189,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "Player"),
					Primitive.newPrimitive(4)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(5)
					}),
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(6)
					})
				)
			),
			new Block(
				"Player", new int[] {189,89,199,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {190,8,199,5},
						new Predicate("line", new Term[] {
							Primitive.newPrimitive(4),
							Primitive.newPrimitive(5),
							Primitive.newPrimitive(6)
						})
					),
					new ModuleCall("C",
						"Player", new int[] {191,8,191,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {192,8,199,5},
						new Comparison("==",
							new Variable(Type.STRING, "Player"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player", new int[] {192,25,195,9},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {193,12,193,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("X")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {194,12,194,46},
									new Performative("inform"),
									Primitive.newPrimitive("X"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {195,13,199,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {196,12,196,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("O")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {197,12,197,46},
									new Performative("inform"),
									Primitive.newPrimitive("O"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {200,9,200,90},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			new AND(
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "Player"),
					Primitive.newPrimitive(7)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(8)
					}),
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "Player"),
						Primitive.newPrimitive(9)
					})
				)
			),
			new Block(
				"Player", new int[] {200,89,210,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {201,8,210,5},
						new Predicate("line", new Term[] {
							Primitive.newPrimitive(7),
							Primitive.newPrimitive(8),
							Primitive.newPrimitive(9)
						})
					),
					new ModuleCall("C",
						"Player", new int[] {202,8,202,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Game won by player "),
								new Variable(Type.STRING, "Player")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {203,8,210,5},
						new Comparison("==",
							new Variable(Type.STRING, "Player"),
							Primitive.newPrimitive("O")
						),
						new Block(
							"Player", new int[] {203,25,206,9},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {204,12,204,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("X")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {205,12,205,46},
									new Performative("inform"),
									Primitive.newPrimitive("X"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {206,13,210,5},
							new Statement[] {
								new ModuleCall("C",
									"Player", new int[] {207,12,207,51},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("Game lost by player "),
											Primitive.newPrimitive("O")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Player","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Send("Player", new int[] {208,12,208,46},
									new Performative("inform"),
									Primitive.newPrimitive("O"),
									new Predicate("EndGame", new Term[] {
										Primitive.newPrimitive("True")
									})
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {212,9,212,36},
			new BeliefEvent('+',
				new Predicate("line", new Term[] {
					new Variable(Type.INTEGER, "a",false),
					new Variable(Type.INTEGER, "b",false),
					new Variable(Type.INTEGER, "c",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {212,35,215,5},
				new Statement[] {
					new ModuleCall("C",
						"Player", new int[] {213,8,213,59},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Winning line: "),
								Operator.newOperator('+',
									new Variable(Type.INTEGER, "a"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" "),
										Operator.newOperator('+',
											new Variable(Type.INTEGER, "b"),
											Operator.newOperator('+',
												Primitive.newPrimitive(" "),
												new Variable(Type.INTEGER, "c")
											)
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Player", new int[] {214,8,215,5},
						new Goal(
							new Predicate("DisplayGame", new Term[] {
								Primitive.newPrimitive("")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {218,9,218,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "Player",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {218,32,220,5},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {222,9,222,37},
			new GoalEvent('+',
				new Goal(
					new Predicate("DisplayGame", new Term[] {
						new Variable(Type.STRING, "board",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {222,36,249,5},
				new Statement[] {
					new ModuleCall("C",
						"Player", new int[] {223,8,223,35},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("\n\n Game \n\n")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Player", new int[] {224,8,249,5},
						Primitive.newPrimitive(1)
					),
					new Declaration(
						new Variable(Type.INTEGER, "j"),
						"Player", new int[] {225,8,249,5},
						Primitive.newPrimitive(0)
					),
					new Assignment(
						new Variable(Type.STRING, "board"),
						"Player", new int[] {226,8,249,5},
						Operator.newOperator('+',
							new Variable(Type.STRING, "board"),
							Primitive.newPrimitive("\n")
						)
					),
					new While(
						"Player", new int[] {227,8,249,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(10)
						),
						new Block(
							"Player", new int[] {227,22,247,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.INTEGER, "j"),
									"Player", new int[] {228,12,247,9},
									Primitive.newPrimitive(0)
								),
								new Declaration(
									new Variable(Type.INTEGER, "index"),
									"Player", new int[] {229,12,247,9},
									new Variable(Type.INTEGER, "i")
								),
								new If(
									"Player", new int[] {230,12,247,9},
									new Predicate("played", new Term[] {
										Primitive.newPrimitive("O"),
										new Variable(Type.INTEGER, "index")
									}),
									new Block(
										"Player", new int[] {230,35,233,17},
										new Statement[] {
											new Assignment(
												new Variable(Type.STRING, "board"),
												"Player", new int[] {232,20,233,17},
												Operator.newOperator('+',
													new Variable(Type.STRING, "board"),
													Operator.newOperator('+',
														Primitive.newPrimitive("| "),
														Operator.newOperator('+',
															Primitive.newPrimitive("O"),
															Primitive.newPrimitive("|")
														)
													)
												)
											)
										}
									),
									new If(
										"Player", new int[] {234,17,247,9},
										new Predicate("played", new Term[] {
											Primitive.newPrimitive("X"),
											new Variable(Type.INTEGER, "index")
										}),
										new Block(
											"Player", new int[] {234,40,237,13},
											new Statement[] {
												new Assignment(
													new Variable(Type.STRING, "board"),
													"Player", new int[] {236,20,237,13},
													Operator.newOperator('+',
														new Variable(Type.STRING, "board"),
														Operator.newOperator('+',
															Primitive.newPrimitive("| "),
															Operator.newOperator('+',
																Primitive.newPrimitive("X"),
																Primitive.newPrimitive("|")
															)
														)
													)
												)
											}
										),
										new Block(
											"Player", new int[] {238,16,247,9},
											new Statement[] {
												new Assignment(
													new Variable(Type.STRING, "board"),
													"Player", new int[] {239,16,240,13},
													Operator.newOperator('+',
														new Variable(Type.STRING, "board"),
														Operator.newOperator('+',
															Primitive.newPrimitive("| "),
															Operator.newOperator('+',
																Primitive.newPrimitive(" "),
																Primitive.newPrimitive("|")
															)
														)
													)
												)
											}
										)
									)
								),
								new If(
									"Player", new int[] {241,12,247,9},
									new Comparison("==",
										Operator.newOperator('%',
											new Variable(Type.INTEGER, "i"),
											Primitive.newPrimitive(3)
										),
										Primitive.newPrimitive(0)
									),
									new Block(
										"Player", new int[] {241,22,243,13},
										new Statement[] {
											new Assignment(
												new Variable(Type.STRING, "board"),
												"Player", new int[] {242,16,243,13},
												Operator.newOperator('+',
													new Variable(Type.STRING, "board"),
													Primitive.newPrimitive("\n")
												)
											)
										}
									)
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"Player", new int[] {246,12,246,15}
								)
							}
						)
					),
					new ModuleCall("C",
						"Player", new int[] {248,8,248,24},
						new Predicate("println", new Term[] {
							new Variable(Type.STRING, "board")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Player().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
