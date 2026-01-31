package fr.spacefox.perftests.quarkus.data.entity46;

import fr.spacefox.perftests.quarkus.core.port.data.Entity46DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service46.model.Model46;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity46Repository implements Entity46DatasourcePort, PanacheRepository<Entity46> {
    @Override
    public Optional<Model46> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
