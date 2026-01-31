package fr.spacefox.perftests.quarkus.data.entity436;

import fr.spacefox.perftests.quarkus.core.port.data.Entity436DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service436.model.Model436;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity436Repository implements Entity436DatasourcePort, PanacheRepository<Entity436> {
    @Override
    public Optional<Model436> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
