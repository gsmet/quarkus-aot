package fr.spacefox.perftests.quarkus.data.entity901;

import fr.spacefox.perftests.quarkus.core.port.data.Entity901DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service901.model.Model901;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity901Repository implements Entity901DatasourcePort, PanacheRepository<Entity901> {
    @Override
    public Optional<Model901> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
