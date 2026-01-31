package fr.spacefox.perftests.quarkus.data.entity88;

import fr.spacefox.perftests.quarkus.core.port.data.Entity88DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service88.model.Model88;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity88Repository implements Entity88DatasourcePort, PanacheRepository<Entity88> {
    @Override
    public Optional<Model88> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
