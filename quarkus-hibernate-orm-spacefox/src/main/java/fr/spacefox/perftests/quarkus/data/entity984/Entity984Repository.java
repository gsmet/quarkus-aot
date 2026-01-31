package fr.spacefox.perftests.quarkus.data.entity984;

import fr.spacefox.perftests.quarkus.core.port.data.Entity984DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service984.model.Model984;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity984Repository implements Entity984DatasourcePort, PanacheRepository<Entity984> {
    @Override
    public Optional<Model984> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
