package fr.spacefox.perftests.quarkus.data.entity638;

import fr.spacefox.perftests.quarkus.core.port.data.Entity638DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service638.model.Model638;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity638Repository implements Entity638DatasourcePort, PanacheRepository<Entity638> {
    @Override
    public Optional<Model638> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
