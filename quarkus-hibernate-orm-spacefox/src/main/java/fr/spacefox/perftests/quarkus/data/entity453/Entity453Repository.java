package fr.spacefox.perftests.quarkus.data.entity453;

import fr.spacefox.perftests.quarkus.core.port.data.Entity453DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service453.model.Model453;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity453Repository implements Entity453DatasourcePort, PanacheRepository<Entity453> {
    @Override
    public Optional<Model453> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
