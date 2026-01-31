package fr.spacefox.perftests.quarkus.data.entity981;

import fr.spacefox.perftests.quarkus.core.service981.model.Model981;

final class Mapper {
    private Mapper() {}

    public static Model981 of(Entity981 entity) {
        return new Model981(entity.getId(), entity.getField());
    }
}
