package fr.spacefox.perftests.quarkus.data.entity893;

import fr.spacefox.perftests.quarkus.core.port.data.Entity893DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service893.model.Model893;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity893Repository implements Entity893DatasourcePort, PanacheRepository<Entity893> {
    @Override
    public Optional<Model893> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
