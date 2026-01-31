package fr.spacefox.perftests.quarkus.data.entity640;

import fr.spacefox.perftests.quarkus.core.port.data.Entity640DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service640.model.Model640;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity640Repository implements Entity640DatasourcePort, PanacheRepository<Entity640> {
    @Override
    public Optional<Model640> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
