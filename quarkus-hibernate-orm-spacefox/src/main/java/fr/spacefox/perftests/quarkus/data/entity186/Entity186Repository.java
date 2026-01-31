package fr.spacefox.perftests.quarkus.data.entity186;

import fr.spacefox.perftests.quarkus.core.port.data.Entity186DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service186.model.Model186;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity186Repository implements Entity186DatasourcePort, PanacheRepository<Entity186> {
    @Override
    public Optional<Model186> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
