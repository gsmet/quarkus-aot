package fr.spacefox.perftests.quarkus.rest.endpoint890;

import fr.spacefox.perftests.quarkus.core.service890.model.Model890;
import fr.spacefox.perftests.quarkus.rest.endpoint890.schema.Schema890;

final class Mapper {
    private Mapper() {}

    public static Schema890 of(Model890 model) {
        return new Schema890(model.id(), model.value());
    }
}
