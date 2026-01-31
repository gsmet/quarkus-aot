package fr.spacefox.perftests.quarkus.rest.endpoint676;

import fr.spacefox.perftests.quarkus.core.service676.model.Model676;
import fr.spacefox.perftests.quarkus.rest.endpoint676.schema.Schema676;

final class Mapper {
    private Mapper() {}

    public static Schema676 of(Model676 model) {
        return new Schema676(model.id(), model.value());
    }
}
