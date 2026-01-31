package fr.spacefox.perftests.quarkus.data.entity934;

import fr.spacefox.perftests.quarkus.core.port.data.Entity934DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service934.model.Model934;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity934Repository implements Entity934DatasourcePort, PanacheRepository<Entity934> {
    @Override
    public Optional<Model934> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
