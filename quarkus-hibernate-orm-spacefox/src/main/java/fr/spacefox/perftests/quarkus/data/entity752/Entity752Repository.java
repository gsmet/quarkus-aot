package fr.spacefox.perftests.quarkus.data.entity752;

import fr.spacefox.perftests.quarkus.core.port.data.Entity752DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service752.model.Model752;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity752Repository implements Entity752DatasourcePort, PanacheRepository<Entity752> {
    @Override
    public Optional<Model752> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
