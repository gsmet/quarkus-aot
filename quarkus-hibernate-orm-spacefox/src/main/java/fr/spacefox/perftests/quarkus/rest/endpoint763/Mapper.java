package fr.spacefox.perftests.quarkus.rest.endpoint763;

import fr.spacefox.perftests.quarkus.core.service763.model.Model763;
import fr.spacefox.perftests.quarkus.rest.endpoint763.schema.Schema763;

final class Mapper {
    private Mapper() {}

    public static Schema763 of(Model763 model) {
        return new Schema763(model.id(), model.value());
    }
}
