package fr.spacefox.perftests.quarkus.data.entity887;

import fr.spacefox.perftests.quarkus.core.port.data.Entity887DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service887.model.Model887;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity887Repository implements Entity887DatasourcePort, PanacheRepository<Entity887> {
    @Override
    public Optional<Model887> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
