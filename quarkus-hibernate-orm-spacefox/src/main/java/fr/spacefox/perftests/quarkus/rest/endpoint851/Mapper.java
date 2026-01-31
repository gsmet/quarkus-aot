package fr.spacefox.perftests.quarkus.rest.endpoint851;

import fr.spacefox.perftests.quarkus.core.service851.model.Model851;
import fr.spacefox.perftests.quarkus.rest.endpoint851.schema.Schema851;

final class Mapper {
    private Mapper() {}

    public static Schema851 of(Model851 model) {
        return new Schema851(model.id(), model.value());
    }
}
