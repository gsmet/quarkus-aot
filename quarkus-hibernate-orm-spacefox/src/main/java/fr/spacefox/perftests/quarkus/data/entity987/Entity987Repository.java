package fr.spacefox.perftests.quarkus.data.entity987;

import fr.spacefox.perftests.quarkus.core.port.data.Entity987DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service987.model.Model987;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity987Repository implements Entity987DatasourcePort, PanacheRepository<Entity987> {
    @Override
    public Optional<Model987> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
