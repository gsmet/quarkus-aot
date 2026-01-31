package fr.spacefox.perftests.quarkus.rest.endpoint971;

import fr.spacefox.perftests.quarkus.core.service971.model.Model971;
import fr.spacefox.perftests.quarkus.rest.endpoint971.schema.Schema971;

final class Mapper {
    private Mapper() {}

    public static Schema971 of(Model971 model) {
        return new Schema971(model.id(), model.value());
    }
}
