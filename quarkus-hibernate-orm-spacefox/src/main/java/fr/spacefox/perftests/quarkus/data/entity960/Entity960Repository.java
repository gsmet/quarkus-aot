package fr.spacefox.perftests.quarkus.data.entity960;

import fr.spacefox.perftests.quarkus.core.port.data.Entity960DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service960.model.Model960;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity960Repository implements Entity960DatasourcePort, PanacheRepository<Entity960> {
    @Override
    public Optional<Model960> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
