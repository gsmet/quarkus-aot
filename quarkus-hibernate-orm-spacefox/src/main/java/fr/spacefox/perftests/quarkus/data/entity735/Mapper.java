package fr.spacefox.perftests.quarkus.data.entity735;

import fr.spacefox.perftests.quarkus.core.service735.model.Model735;

final class Mapper {
    private Mapper() {}

    public static Model735 of(Entity735 entity) {
        return new Model735(entity.getId(), entity.getField());
    }
}
