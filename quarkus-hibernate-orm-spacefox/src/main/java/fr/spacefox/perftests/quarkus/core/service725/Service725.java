package fr.spacefox.perftests.quarkus.core.service725;

import fr.spacefox.perftests.quarkus.core.port.data.Entity725DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service725.model.Model725;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service725 {

    private final Entity725DatasourcePort datasource;

    public Service725(Entity725DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model725 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
