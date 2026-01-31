package fr.spacefox.perftests.quarkus.data.entity443;

import fr.spacefox.perftests.quarkus.core.port.data.Entity443DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service443.model.Model443;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity443Repository implements Entity443DatasourcePort, PanacheRepository<Entity443> {
    @Override
    public Optional<Model443> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
