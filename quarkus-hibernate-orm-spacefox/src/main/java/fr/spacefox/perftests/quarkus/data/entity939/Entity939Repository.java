package fr.spacefox.perftests.quarkus.data.entity939;

import fr.spacefox.perftests.quarkus.core.port.data.Entity939DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service939.model.Model939;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity939Repository implements Entity939DatasourcePort, PanacheRepository<Entity939> {
    @Override
    public Optional<Model939> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
