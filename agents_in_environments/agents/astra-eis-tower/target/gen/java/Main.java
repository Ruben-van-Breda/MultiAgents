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


public class Main extends ASTRAClass {
	public Main() {
		setParents(new Class[] {astra.lang.Agent.class});
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.STRING, "X",false)
			}),
			new NOT(
				new ModuleFormula("ei",
					new Predicate("on", new Term[] {
						new Variable(Type.STRING, "Y",false),
						new Variable(Type.STRING, "X")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			)
		));
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.STRING, "X",false)
			}),
			new Comparison("==",
				new Variable(Type.STRING, "X"),
				Primitive.newPrimitive("table")
			)
		));
		addRule(new Rule(
			"Main", new int[] {21,9,21,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {21,27,61,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {22,8,22,52},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("hw"),
							Primitive.newPrimitive("dependency/tower-1.3.0.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {23,8,23,17},
						new Predicate("init", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).init(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {25,8,25,18},
						new Predicate("start", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).start(
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {26,8,26,26},
						new Predicate("link", new Term[] {
							Primitive.newPrimitive("gripper")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"Main", new int[] {28,8,28,64},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Press New Block until block g is created...")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Wait(
						"Main", new int[] {29,8,61,5},
						new ModuleFormula("ei",
							new Predicate("block", new Term[] {
								Primitive.newPrimitive("g")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Main", new int[] {33,8,61,5},
						Primitive.newPrimitive(0)
					),
					new While(
						"Main", new int[] {34,8,61,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(5)
						),
						new Block(
							"Main", new int[] {34,19,39,9},
							new Statement[] {
								new ModuleCall("S",
									"Main", new int[] {35,12,35,24},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(1000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Main","S")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new Subgoal(
									"Main", new int[] {36,12,39,9},
									new Goal(
										new Predicate("random_tower", new Term[] {})
									)
								),
								new ModuleCall("S",
									"Main", new int[] {37,12,37,24},
									new Predicate("sleep", new Term[] {
										Primitive.newPrimitive(2000)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return false;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Main","S")).sleep(
												(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"Main", new int[] {38,12,38,15}
								)
							}
						)
					),
					new ModuleCall("C",
						"Main", new int[] {40,8,40,30},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("All done!")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {65,9,65,30},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Variable(Type.FUNCTION, "Y",false)
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Main","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {65,29,67,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {66,8,66,27},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Y: "),
								new Variable(Type.FUNCTION, "Y")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {68,9,68,44},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("holding", new Term[] {
						new Variable(Type.STRING, "block",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("Main","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {68,43,70,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {69,8,69,37},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("holding: "),
								new Variable(Type.STRING, "block")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {72,9,72,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("pickup", new Term[] {
						new Variable(Type.STRING, "target",false)
					})
				)
			),
			new ModuleFormula("ei",
				new Predicate("on", new Term[] {
					new Variable(Type.STRING, "top",false),
					new Variable(Type.STRING, "target")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"Main", new int[] {72,60,79,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {74,8,74,22},
						new Predicate("pickup", new Term[] {
							new Variable(Type.STRING, "top")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Subgoal(
						"Main", new int[] {75,8,79,5},
						new Goal(
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "top"),
								Primitive.newPrimitive("table")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {80,9,80,29},
			new GoalEvent('+',
				new Goal(
					new Predicate("pickup", new Term[] {
						new Variable(Type.STRING, "X",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {80,28,83,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {81,8,81,20},
						new Predicate("pickup", new Term[] {
							new Variable(Type.STRING, "X")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {85,9,85,40},
			new GoalEvent('+',
				new Goal(
					new Predicate("tower", new Term[] {
						new Variable(Type.LIST, "stack",false),
						new Variable(Type.INTEGER, "size",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {85,39,116,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Main", new int[] {86,8,116,5},
						Operator.newOperator('-',
							new Variable(Type.INTEGER, "size"),
							Primitive.newPrimitive(1)
						)
					),
					new Declaration(
						new Variable(Type.STRING, "current_block"),
						"Main", new int[] {87,8,116,5},
						new ModuleTerm("prelude", Type.STRING,
							new Predicate("valueAsString", new Term[] {
								new Variable(Type.LIST, "stack"),
								new Variable(Type.INTEGER, "i")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Prelude) intention.getModule("Main","prelude")).valueAsString(
										(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
										(int) intention.evaluate(predicate.getTerm(1))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).valueAsString(
										(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
										(int) visitor.evaluate(predicate.getTerm(1))
									);
								}
							}
						)
					),
					new ModuleCall("C",
						"Main", new int[] {88,8,88,32},
						new Predicate("println", new Term[] {
							new Variable(Type.STRING, "current_block")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new While(
						"Main", new int[] {89,8,116,5},
						new Comparison(">=",
							new Variable(Type.INTEGER, "i"),
							Primitive.newPrimitive(0)
						),
						new Block(
							"Main", new int[] {89,20,115,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.STRING, "current_block"),
									"Main", new int[] {90,12,115,9},
									new ModuleTerm("prelude", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "stack"),
											new Variable(Type.INTEGER, "i")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("Main","prelude")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(int) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).valueAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(int) visitor.evaluate(predicate.getTerm(1))
												);
											}
										}
									)
								),
								new If(
									"Main", new int[] {99,12,115,9},
									new Comparison("<",
										new Variable(Type.INTEGER, "i"),
										Operator.newOperator('-',
											new Variable(Type.INTEGER, "size"),
											Primitive.newPrimitive(1)
										)
									),
									new Block(
										"Main", new int[] {99,26,107,13},
										new Statement[] {
											new Declaration(
												new Variable(Type.INTEGER, "prev"),
												"Main", new int[] {100,16,107,13},
												Operator.newOperator('+',
													new Variable(Type.INTEGER, "i"),
													Primitive.newPrimitive(1)
												)
											),
											new Declaration(
												new Variable(Type.STRING, "prev_block"),
												"Main", new int[] {101,16,107,13},
												new ModuleTerm("prelude", Type.STRING,
													new Predicate("valueAsString", new Term[] {
														new Variable(Type.LIST, "stack"),
														new Variable(Type.INTEGER, "prev")
													}),
													new ModuleTermAdaptor() {
														public Object invoke(Intention intention, Predicate predicate) {
															return ((astra.lang.Prelude) intention.getModule("Main","prelude")).valueAsString(
																(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																(int) intention.evaluate(predicate.getTerm(1))
															);
														}
														public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).valueAsString(
																(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																(int) visitor.evaluate(predicate.getTerm(1))
															);
														}
													}
												)
											),
											new Subgoal(
												"Main", new int[] {102,16,107,13},
												new Goal(
													new Predicate("holding", new Term[] {
														new Variable(Type.STRING, "current_block")
													})
												)
											),
											new Wait(
												"Main", new int[] {103,16,107,13},
												new ModuleFormula("ei",
													new Predicate("holding", new Term[] {
														new Variable(Type.STRING, "current_block")
													}),
													new ModuleFormulaAdaptor() {
														public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
														}
													}
												)
											),
											new Subgoal(
												"Main", new int[] {104,16,107,13},
												new Goal(
													new Predicate("on", new Term[] {
														new Variable(Type.STRING, "current_block"),
														new Variable(Type.STRING, "prev_block")
													})
												)
											),
											new Wait(
												"Main", new int[] {105,16,107,13},
												new ModuleFormula("ei",
													new Predicate("on", new Term[] {
														new Variable(Type.STRING, "current_block"),
														new Variable(Type.STRING, "prev_block")
													}),
													new ModuleFormulaAdaptor() {
														public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
															return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
														}
													}
												)
											)
										}
									),
									new Block(
										"Main", new int[] {108,16,115,9},
										new Statement[] {
											new ModuleCall("C",
												"Main", new int[] {109,12,109,54},
												new Predicate("println", new Term[] {
													new ModuleTerm("prelude", Type.STRING,
														new Predicate("valueAsString", new Term[] {
															new Variable(Type.LIST, "stack"),
															new Variable(Type.INTEGER, "i")
														}),
														new ModuleTermAdaptor() {
															public Object invoke(Intention intention, Predicate predicate) {
																return ((astra.lang.Prelude) intention.getModule("Main","prelude")).valueAsString(
																	(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
																	(int) intention.evaluate(predicate.getTerm(1))
																);
															}
															public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
																return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).valueAsString(
																	(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
																	(int) visitor.evaluate(predicate.getTerm(1))
																);
															}
														}
													)
												}),
												new DefaultModuleCallAdaptor() {
													public boolean inline() {
														return true;
													}

													public boolean invoke(Intention intention, Predicate predicate) {
														return ((astra.lang.Console) intention.getModule("Main","C")).println(
															(java.lang.String) intention.evaluate(predicate.getTerm(0))
														);
													}
												}
											)
										}
									)
								),
								new MinusMinus(
									new Variable(Type.INTEGER, "i"),
									"Main", new int[] {112,12,112,15}
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {118,9,118,27},
			new GoalEvent('+',
				new Goal(
					new Predicate("random_tower", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {118,26,142,5},
				new Statement[] {
					new Declaration(
						new Variable(Type.INTEGER, "random_size"),
						"Main", new int[] {120,8,142,5},
						Operator.newOperator('%',
							new ModuleTerm("math", Type.INTEGER,
								new Predicate("randomInt", new Term[] {}),
								new ModuleTermAdaptor() {
									public Object invoke(Intention intention, Predicate predicate) {
										return ((astra.lang.Math) intention.getModule("Main","math")).randomInt(
										);
									}
									public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.Math) visitor.agent().getModule("Main","math")).randomInt(
										);
									}
								}
							),
							Primitive.newPrimitive(7)
						)
					),
					new While(
						"Main", new int[] {121,8,142,5},
						new OR(
							new Comparison("<",
								new Variable(Type.INTEGER, "random_size"),
								Primitive.newPrimitive(3)
							),
							new Comparison(">",
								new Variable(Type.INTEGER, "random_size"),
								Primitive.newPrimitive(5)
							)
						),
						new Block(
							"Main", new int[] {121,46,123,9},
							new Statement[] {
								new Assignment(
									new Variable(Type.INTEGER, "random_size"),
									"Main", new int[] {122,13,123,9},
									Operator.newOperator('%',
										new ModuleTerm("math", Type.INTEGER,
											new Predicate("randomInt", new Term[] {}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Math) intention.getModule("Main","math")).randomInt(
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Math) visitor.agent().getModule("Main","math")).randomInt(
													);
												}
											}
										),
										Primitive.newPrimitive(7)
									)
								)
							}
						)
					),
					new PlusPlus(
						new Variable(Type.INTEGER, "random_size"),
						"Main", new int[] {124,8,124,21}
					),
					new Subgoal(
						"Main", new int[] {127,8,142,5},
						new Goal(
							new Predicate("shuffle", new Term[] {
								new ListTerm(new Term[] {
									Primitive.newPrimitive("a"),
									Primitive.newPrimitive("b"),
									Primitive.newPrimitive("c"),
									Primitive.newPrimitive("d"),
									Primitive.newPrimitive("e"),
									Primitive.newPrimitive("f"),
									Primitive.newPrimitive("g")
								}),
								new Variable(Type.LIST, "OUT",false),
								new Variable(Type.INTEGER, "random_size")
							})
						)
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Main", new int[] {128,8,142,5},
						Primitive.newPrimitive(0)
					),
					new Declaration(
						new Variable(Type.LIST, "towerList"),
						"Main", new int[] {129,8,142,5},
						new ListTerm(new Term[] {

						})
					),
					new While(
						"Main", new int[] {130,8,142,5},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							new Variable(Type.INTEGER, "random_size")
						),
						new Block(
							"Main", new int[] {130,30,135,9},
							new Statement[] {
								new Declaration(
									new Variable(Type.STRING, "block_string"),
									"Main", new int[] {131,12,135,9},
									new ModuleTerm("prelude", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "OUT"),
											new Variable(Type.INTEGER, "i")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("Main","prelude")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(int) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).valueAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(int) visitor.evaluate(predicate.getTerm(1))
												);
											}
										}
									)
								),
								new Assignment(
									new Variable(Type.LIST, "towerList"),
									"Main", new int[] {132,12,135,9},
									Operator.newOperator('+',
										new Variable(Type.LIST, "towerList"),
										new ListTerm(new Term[] {
											new Variable(Type.STRING, "block_string")
										})
									)
								),
								new PlusPlus(
									new Variable(Type.INTEGER, "i"),
									"Main", new int[] {133,12,133,15}
								)
							}
						)
					),
					new ModuleCall("C",
						"Main", new int[] {137,8,137,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Building tower: "),
								new Variable(Type.LIST, "towerList")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {138,8,138,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {140,8,142,5},
						new Goal(
							new Predicate("tower", new Term[] {
								new Variable(Type.LIST, "towerList"),
								new Variable(Type.INTEGER, "random_size")
							})
						)
					),
					new ModuleCall("S",
						"Main", new int[] {141,8,141,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {149,9,149,46},
			new GoalEvent('+',
				new Goal(
					new Predicate("shuffle", new Term[] {
						new Variable(Type.LIST, "in",false),
						new Variable(Type.LIST, "out",false),
						new Variable(Type.INTEGER, "N",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {149,45,160,7},
				new Statement[] {
					new Assignment(
						new Variable(Type.LIST, "out"),
						"Main", new int[] {150,10,160,7},
						new Variable(Type.LIST, "in")
					),
					new Declaration(
						new Variable(Type.INTEGER, "i"),
						"Main", new int[] {151,10,160,7},
						Primitive.newPrimitive(0)
					),
					new While(
						"Main", new int[] {152,10,160,7},
						new Comparison("<",
							new Variable(Type.INTEGER, "i"),
							new Variable(Type.INTEGER, "N")
						),
						new Block(
							"Main", new int[] {152,24,159,11},
							new Statement[] {
								new Declaration(
									new Variable(Type.INTEGER, "j"),
									"Main", new int[] {153,14,159,11},
									Operator.newOperator('%',
										new ModuleTerm("math", Type.INTEGER,
											new Predicate("randomInt", new Term[] {}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Math) intention.getModule("Main","math")).randomInt(
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Math) visitor.agent().getModule("Main","math")).randomInt(
													);
												}
											}
										),
										new ModuleTerm("prelude", Type.INTEGER,
											new Predicate("size", new Term[] {
												new Variable(Type.LIST, "out")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("Main","prelude")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										)
									)
								),
								new Declaration(
									new Variable(Type.INTEGER, "k"),
									"Main", new int[] {154,14,159,11},
									Operator.newOperator('%',
										new ModuleTerm("math", Type.INTEGER,
											new Predicate("randomInt", new Term[] {}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Math) intention.getModule("Main","math")).randomInt(
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Math) visitor.agent().getModule("Main","math")).randomInt(
													);
												}
											}
										),
										new ModuleTerm("prelude", Type.INTEGER,
											new Predicate("size", new Term[] {
												new Variable(Type.LIST, "out")
											}),
											new ModuleTermAdaptor() {
												public Object invoke(Intention intention, Predicate predicate) {
													return ((astra.lang.Prelude) intention.getModule("Main","prelude")).size(
														(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
													);
												}
												public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
													return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).size(
														(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0))
													);
												}
											}
										)
									)
								),
								new Declaration(
									new Variable(Type.STRING, "temp"),
									"Main", new int[] {155,14,159,11},
									new ModuleTerm("prelude", Type.STRING,
										new Predicate("valueAsString", new Term[] {
											new Variable(Type.LIST, "in"),
											new Variable(Type.INTEGER, "j")
										}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Prelude) intention.getModule("Main","prelude")).valueAsString(
													(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
													(int) intention.evaluate(predicate.getTerm(1))
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Prelude) visitor.agent().getModule("Main","prelude")).valueAsString(
													(astra.term.ListTerm) visitor.evaluate(predicate.getTerm(0)),
													(int) visitor.evaluate(predicate.getTerm(1))
												);
											}
										}
									)
								),
								new ModuleCall("prelude",
									"Main", new int[] {157,14,157,37},
									new Predicate("swap", new Term[] {
										new Variable(Type.LIST, "out"),
										new Variable(Type.INTEGER, "j"),
										new Variable(Type.INTEGER, "k")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Prelude) intention.getModule("Main","prelude")).swap(
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0)),
												(java.lang.Integer) intention.evaluate(predicate.getTerm(1)),
												(java.lang.Integer) intention.evaluate(predicate.getTerm(2))
											);
										}
									}
								),
								new Assignment(
									new Variable(Type.INTEGER, "i"),
									"Main", new int[] {158,14,159,11},
									Operator.newOperator('+',
										new Variable(Type.INTEGER, "i"),
										Primitive.newPrimitive(1)
									)
								)
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {162,9,162,64},
			new GoalEvent('+',
				new Goal(
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "X",false)
					})
				)
			),
			new AND(
				new NOT(
					new ModuleFormula("ei",
						new Predicate("holding", new Term[] {
							new Variable(Type.STRING, "Y",false)
						}),
						new ModuleFormulaAdaptor() {
							public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
								return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
							}
						}
					)
				),
				new Predicate("free", new Term[] {
					new Variable(Type.STRING, "X")
				})
			),
			new Block(
				"Main", new int[] {162,63,167,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {163,8,163,37},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("picking up: "),
								new Variable(Type.STRING, "X")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {164,8,164,20},
						new Predicate("pickup", new Term[] {
							new Variable(Type.STRING, "X")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {165,8,167,5},
						new ModuleFormula("ei",
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "X")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {169,9,169,83},
			new GoalEvent('+',
				new Goal(
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "X",false)
					})
				)
			),
			new AND(
				new NOT(
					new ModuleFormula("ei",
						new Predicate("holding", new Term[] {
							new Variable(Type.STRING, "X")
						}),
						new ModuleFormulaAdaptor() {
							public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
								return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
							}
						}
					)
				),
				new AND(
					new NOT(
						new Predicate("free", new Term[] {
							new Variable(Type.STRING, "X")
						})
					),
					new ModuleFormula("ei",
						new Predicate("on", new Term[] {
							new Variable(Type.STRING, "other",false),
							new Variable(Type.STRING, "X")
						}),
						new ModuleFormulaAdaptor() {
							public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
								return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
							}
						}
					)
				)
			),
			new Block(
				"Main", new int[] {169,82,182,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {170,8,170,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("divert: picking up: "),
								new Variable(Type.STRING, "other")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {172,8,182,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "other")
							})
						)
					),
					new Wait(
						"Main", new int[] {173,8,182,5},
						new ModuleFormula("ei",
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "other")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("C",
						"Main", new int[] {175,8,175,58},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("putting down: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "other"),
									Primitive.newPrimitive(" on: table")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {176,8,176,34},
						new Predicate("putdown", new Term[] {
							new Variable(Type.STRING, "other"),
							Primitive.newPrimitive("table")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {177,8,182,5},
						new ModuleFormula("ei",
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "other"),
								Primitive.newPrimitive("table")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("C",
						"Main", new int[] {179,8,179,56},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Picking up original goal block "),
								new Variable(Type.STRING, "X")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {180,8,180,20},
						new Predicate("pickup", new Term[] {
							new Variable(Type.STRING, "X")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {181,8,182,5},
						new ModuleFormula("ei",
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "X")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {184,9,184,117},
			new GoalEvent('+',
				new Goal(
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "X",false)
					})
				)
			),
			new AND(
				new NOT(
					new ModuleFormula("ei",
						new Predicate("holding", new Term[] {
							new Variable(Type.STRING, "X")
						}),
						new ModuleFormulaAdaptor() {
							public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
								return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
							}
						}
					)
				),
				new AND(
					new NOT(
						new Predicate("free", new Term[] {
							new Variable(Type.STRING, "X")
						})
					),
					new AND(
						new NOT(
							new ModuleFormula("ei",
								new Predicate("on", new Term[] {
									new Variable(Type.STRING, "X"),
									Primitive.newPrimitive("table")
								}),
								new ModuleFormulaAdaptor() {
									public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
									}
								}
							)
						),
						new ModuleFormula("ei",
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "other2",false),
								new Variable(Type.STRING, "other",false)
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				)
			),
			new Block(
				"Main", new int[] {184,116,197,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {185,8,185,49},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("divert: picking up: "),
								new Variable(Type.STRING, "other")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {187,8,197,5},
						new Goal(
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "other")
							})
						)
					),
					new Wait(
						"Main", new int[] {188,8,197,5},
						new ModuleFormula("ei",
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "other")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("C",
						"Main", new int[] {190,8,190,58},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("putting down: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "other"),
									Primitive.newPrimitive(" on: table")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {191,8,191,34},
						new Predicate("putdown", new Term[] {
							new Variable(Type.STRING, "other"),
							Primitive.newPrimitive("table")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {192,8,197,5},
						new ModuleFormula("ei",
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "other"),
								Primitive.newPrimitive("table")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					),
					new ModuleCall("C",
						"Main", new int[] {194,8,194,61},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Picking up original goal block "),
								new Variable(Type.STRING, "other2")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {195,8,195,25},
						new Predicate("pickup", new Term[] {
							new Variable(Type.STRING, "other2")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {196,8,197,5},
						new ModuleFormula("ei",
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "other2")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {201,9,201,54},
			new GoalEvent('+',
				new Goal(
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "X",false)
					})
				)
			),
			new NOT(
				new ModuleFormula("ei",
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "Y",false)
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			),
			new Block(
				"Main", new int[] {201,53,206,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {202,8,202,37},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("picking up: "),
								new Variable(Type.STRING, "X")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {203,8,203,20},
						new Predicate("pickup", new Term[] {
							new Variable(Type.STRING, "X")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {204,8,206,5},
						new ModuleFormula("ei",
							new Predicate("holding", new Term[] {
								new Variable(Type.STRING, "X")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {209,9,209,61},
			new GoalEvent('+',
				new Goal(
					new Predicate("on", new Term[] {
						new Variable(Type.STRING, "X",false),
						new Variable(Type.STRING, "Y",false)
					})
				)
			),
			new AND(
				new ModuleFormula("ei",
					new Predicate("holding", new Term[] {
						new Variable(Type.STRING, "X")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new Predicate("free", new Term[] {
					new Variable(Type.STRING, "Y")
				})
			),
			new Block(
				"Main", new int[] {209,60,214,5},
				new Statement[] {
					new ModuleCall("C",
						"Main", new int[] {210,8,210,47},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("putting: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "X"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" on: "),
										new Variable(Type.STRING, "Y")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {211,8,211,24},
						new Predicate("putdown", new Term[] {
							new Variable(Type.STRING, "X"),
							new Variable(Type.STRING, "Y")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Wait(
						"Main", new int[] {212,8,214,5},
						new ModuleFormula("ei",
							new Predicate("on", new Term[] {
								new Variable(Type.STRING, "X"),
								new Variable(Type.STRING, "Y")
							}),
							new ModuleFormulaAdaptor() {
								public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).auto_formula((Predicate) predicate.accept(visitor));
								}
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("Main","ei")).sense();
			}
		});

	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("prelude",astra.lang.Prelude.class,agent);
		fragment.addModule("math",astra.lang.Math.class,agent);
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
			astra.core.Agent agent = new Main().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
