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


public class Better extends ASTRAClass {
	public Better() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"Better", new int[] {3,9,3,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Better", new int[] {3,35,3,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {3,37,3,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(5)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {4,9,4,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Better", new int[] {4,35,4,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {4,37,4,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(3)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {5,9,5,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Better", new int[] {5,35,5,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {5,37,5,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(7)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {7,9,7,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Better", new int[] {7,35,7,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {7,37,7,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(4)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {8,9,8,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Better", new int[] {8,35,8,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {8,37,8,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(6)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {18,9,18,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Better", new int[] {18,35,18,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {18,37,18,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(2)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {19,9,19,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Better", new int[] {19,35,19,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {19,37,19,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(3)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {20,9,20,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Better", new int[] {20,35,20,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {20,37,20,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(4)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {21,9,21,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Better", new int[] {21,35,21,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {21,37,21,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(5)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {22,9,22,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Better", new int[] {22,35,22,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {22,37,22,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(6)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {23,9,23,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Better", new int[] {23,35,23,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {23,37,23,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(7)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {24,9,24,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"Better", new int[] {24,35,24,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {24,37,24,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(8)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {25,9,25,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"Better", new int[] {25,35,25,50},
				new Statement[] {
					new Subgoal(
						"Better", new int[] {25,37,25,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(9)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {27,9,27,93},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false),
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					new Variable(Type.INTEGER, "L")
				}),
				new AND(
					new Predicate("opponent", new Term[] {
						new Variable(Type.STRING, "T2",false)
					}),
					new AND(
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						}),
						new NOT(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T2"),
								new Variable(Type.INTEGER, "L")
							})
						)
					)
				)
			),
			new Block(
				"Better", new int[] {27,92,46,5},
				new Statement[] {
					new ModuleCall("C",
						"Better", new int[] {31,8,31,40},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "T"),
								Operator.newOperator('+',
									Primitive.newPrimitive(" moving to "),
									new Variable(Type.INTEGER, "L")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Better","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"Better", new int[] {32,8,46,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('-',
						"Better", new int[] {33,8,46,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('-',
						"Better", new int[] {34,8,46,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					),
					new Subgoal(
						"Better", new int[] {37,8,46,5},
						new Goal(
							new Predicate("DisplayGame", new Term[] {
								Primitive.newPrimitive("")
							})
						)
					),
					new Subgoal(
						"Better", new int[] {38,8,46,5},
						new Goal(
							new Predicate("winner", new Term[] {
								new Variable(Type.STRING, "T")
							})
						)
					),
					new Subgoal(
						"Better", new int[] {39,8,46,5},
						new Goal(
							new Predicate("CheckDraw", new Term[] {})
						)
					),
					new Send("Better", new int[] {41,8,41,38},
						new Performative("inform"),
						new Variable(Type.STRING, "T2"),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					),
					new Send("Better", new int[] {42,8,42,40},
						new Performative("request"),
						new Variable(Type.STRING, "T2"),
						new Predicate("startTurn", new Term[] {
							new Variable(Type.STRING, "T2")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {48,9,48,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false),
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Better", new int[] {48,32,50,5},
				new Statement[] {
					new ModuleCall("C",
						"Better", new int[] {49,8,49,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("No moves left")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Better","C")).println(
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
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
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
			astra.core.Agent agent = new Better().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
