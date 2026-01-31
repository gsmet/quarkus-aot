package fr.spacefox.perftests.quarkus.rest.endpoint966;

import fr.spacefox.perftests.quarkus.core.service966.model.Model966;
import fr.spacefox.perftests.quarkus.rest.endpoint966.schema.Schema966;

final class Mapper {
    private Mapper() {}

    public static Schema966 of(Model966 model) {
        return new Schema966(model.id(), model.value());
    }
}
