package fr.spacefox.perftests.quarkus.rest.endpoint620;

import fr.spacefox.perftests.quarkus.core.service620.model.Model620;
import fr.spacefox.perftests.quarkus.rest.endpoint620.schema.Schema620;

final class Mapper {
    private Mapper() {}

    public static Schema620 of(Model620 model) {
        return new Schema620(model.id(), model.value());
    }
}
