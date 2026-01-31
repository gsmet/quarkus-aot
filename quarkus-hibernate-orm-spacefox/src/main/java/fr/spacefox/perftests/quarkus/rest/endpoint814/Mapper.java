package fr.spacefox.perftests.quarkus.rest.endpoint814;

import fr.spacefox.perftests.quarkus.core.service814.model.Model814;
import fr.spacefox.perftests.quarkus.rest.endpoint814.schema.Schema814;

final class Mapper {
    private Mapper() {}

    public static Schema814 of(Model814 model) {
        return new Schema814(model.id(), model.value());
    }
}
