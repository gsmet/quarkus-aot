package fr.spacefox.perftests.quarkus.core.service914;

import fr.spacefox.perftests.quarkus.core.port.data.Entity914DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service914.model.Model914;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service914 {

    private final Entity914DatasourcePort datasource;

    public Service914(Entity914DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model914 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
