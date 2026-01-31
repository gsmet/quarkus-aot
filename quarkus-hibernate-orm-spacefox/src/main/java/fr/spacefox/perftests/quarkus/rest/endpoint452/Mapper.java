package fr.spacefox.perftests.quarkus.rest.endpoint452;

import fr.spacefox.perftests.quarkus.core.service452.model.Model452;
import fr.spacefox.perftests.quarkus.rest.endpoint452.schema.Schema452;

final class Mapper {
    private Mapper() {}

    public static Schema452 of(Model452 model) {
        return new Schema452(model.id(), model.value());
    }
}
