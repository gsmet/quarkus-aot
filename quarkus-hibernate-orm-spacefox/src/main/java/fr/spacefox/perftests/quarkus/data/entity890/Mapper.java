package fr.spacefox.perftests.quarkus.data.entity890;

import fr.spacefox.perftests.quarkus.core.service890.model.Model890;

final class Mapper {
    private Mapper() {}

    public static Model890 of(Entity890 entity) {
        return new Model890(entity.getId(), entity.getField());
    }
}
