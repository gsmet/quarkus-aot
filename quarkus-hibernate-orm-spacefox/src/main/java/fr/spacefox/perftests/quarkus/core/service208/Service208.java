package fr.spacefox.perftests.quarkus.core.service208;

import fr.spacefox.perftests.quarkus.core.port.data.Entity208DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service208.model.Model208;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service208 {

    private final Entity208DatasourcePort datasource;

    public Service208(Entity208DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model208 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
