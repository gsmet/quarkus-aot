package fr.spacefox.perftests.quarkus.core.service496;

import fr.spacefox.perftests.quarkus.core.port.data.Entity496DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service496.model.Model496;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service496 {

    private final Entity496DatasourcePort datasource;

    public Service496(Entity496DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model496 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
