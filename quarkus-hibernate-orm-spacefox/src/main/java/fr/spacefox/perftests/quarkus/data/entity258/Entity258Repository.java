package fr.spacefox.perftests.quarkus.data.entity258;

import fr.spacefox.perftests.quarkus.core.port.data.Entity258DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service258.model.Model258;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity258Repository implements Entity258DatasourcePort, PanacheRepository<Entity258> {
    @Override
    public Optional<Model258> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
