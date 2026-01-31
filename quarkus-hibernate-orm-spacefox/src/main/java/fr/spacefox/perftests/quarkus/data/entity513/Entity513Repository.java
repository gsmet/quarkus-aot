package fr.spacefox.perftests.quarkus.data.entity513;

import fr.spacefox.perftests.quarkus.core.port.data.Entity513DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service513.model.Model513;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity513Repository implements Entity513DatasourcePort, PanacheRepository<Entity513> {
    @Override
    public Optional<Model513> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
