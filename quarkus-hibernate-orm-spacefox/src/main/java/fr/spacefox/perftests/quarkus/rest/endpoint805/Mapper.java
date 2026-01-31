package fr.spacefox.perftests.quarkus.rest.endpoint805;

import fr.spacefox.perftests.quarkus.core.service805.model.Model805;
import fr.spacefox.perftests.quarkus.rest.endpoint805.schema.Schema805;

final class Mapper {
    private Mapper() {}

    public static Schema805 of(Model805 model) {
        return new Schema805(model.id(), model.value());
    }
}
