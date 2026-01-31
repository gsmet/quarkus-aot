package fr.spacefox.perftests.quarkus.core.service251;

import fr.spacefox.perftests.quarkus.core.port.data.Entity251DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service251.model.Model251;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service251 {

    private final Entity251DatasourcePort datasource;

    public Service251(Entity251DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model251 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
