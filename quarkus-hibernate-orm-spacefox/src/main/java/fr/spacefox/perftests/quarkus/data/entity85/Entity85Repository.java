package fr.spacefox.perftests.quarkus.data.entity85;

import fr.spacefox.perftests.quarkus.core.port.data.Entity85DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service85.model.Model85;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity85Repository implements Entity85DatasourcePort, PanacheRepository<Entity85> {
    @Override
    public Optional<Model85> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
