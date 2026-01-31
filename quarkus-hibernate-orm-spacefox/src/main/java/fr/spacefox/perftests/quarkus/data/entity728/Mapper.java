package fr.spacefox.perftests.quarkus.data.entity728;

import fr.spacefox.perftests.quarkus.core.service728.model.Model728;

final class Mapper {
    private Mapper() {}

    public static Model728 of(Entity728 entity) {
        return new Model728(entity.getId(), entity.getField());
    }
}
