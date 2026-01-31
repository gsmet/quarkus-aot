package fr.spacefox.perftests.quarkus.data.entity710;

import fr.spacefox.perftests.quarkus.core.port.data.Entity710DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service710.model.Model710;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity710Repository implements Entity710DatasourcePort, PanacheRepository<Entity710> {
    @Override
    public Optional<Model710> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
