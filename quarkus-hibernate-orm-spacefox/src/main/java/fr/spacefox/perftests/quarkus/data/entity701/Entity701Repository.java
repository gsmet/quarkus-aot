package fr.spacefox.perftests.quarkus.data.entity701;

import fr.spacefox.perftests.quarkus.core.port.data.Entity701DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service701.model.Model701;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity701Repository implements Entity701DatasourcePort, PanacheRepository<Entity701> {
    @Override
    public Optional<Model701> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
