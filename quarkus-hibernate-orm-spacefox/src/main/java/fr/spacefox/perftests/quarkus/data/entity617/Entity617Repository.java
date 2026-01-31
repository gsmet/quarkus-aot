package fr.spacefox.perftests.quarkus.data.entity617;

import fr.spacefox.perftests.quarkus.core.port.data.Entity617DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service617.model.Model617;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity617Repository implements Entity617DatasourcePort, PanacheRepository<Entity617> {
    @Override
    public Optional<Model617> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
