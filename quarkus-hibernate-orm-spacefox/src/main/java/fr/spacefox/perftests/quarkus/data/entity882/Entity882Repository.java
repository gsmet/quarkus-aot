package fr.spacefox.perftests.quarkus.data.entity882;

import fr.spacefox.perftests.quarkus.core.port.data.Entity882DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service882.model.Model882;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity882Repository implements Entity882DatasourcePort, PanacheRepository<Entity882> {
    @Override
    public Optional<Model882> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
