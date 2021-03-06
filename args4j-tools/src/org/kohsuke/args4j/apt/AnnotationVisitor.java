package org.kohsuke.args4j.apt;



/**
 * @author Kohsuke Kawaguchi
 */
interface AnnotationVisitor {
  /**
   * @deprecated as of 2.0.17 use {@link #onOption(OptionWithUsage)}
   */
  @Deprecated
  void onOption(String name, String usage);

  void onOption(OptionWithUsage optionWithUsage);

  void done();
}
