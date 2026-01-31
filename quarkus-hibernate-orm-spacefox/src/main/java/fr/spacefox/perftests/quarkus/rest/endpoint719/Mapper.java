package fr.spacefox.perftests.quarkus.rest.endpoint719;

import fr.spacefox.perftests.quarkus.core.service719.model.Model719;
import fr.spacefox.perftests.quarkus.rest.endpoint719.schema.Schema719;

final class Mapper {
    private Mapper() {}

    public static Schema719 of(Model719 model) {
        return new Schema719(model.id(), model.value());
    }
}
